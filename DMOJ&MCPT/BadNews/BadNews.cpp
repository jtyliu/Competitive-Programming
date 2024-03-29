//============================================================================
// Name        : BadNews.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <bits/stdc++.h>

using namespace std;
char in[26][26],word[626];
int n,q;
bool visited[26][26];
int dirX[]={1,1,0,-1,-1,-1,0,1};
int dirY[]={0,1,1,1,0,-1,-1,-1};
bool isBetween(int x,int y){return x>=0&&x<n&&y>=0&&y<n;}
bool hasLet(int x,int y,int charAt){
	if(charAt==strlen(word))return true;
//	printf("Has reached %d let for word %s\n",charAt,word);
	if(word[charAt]!=in[y][x]) return false;
	visited[y][x]=true;
	bool t=false;
	for(int i=0; i<8; i++){
		if(isBetween(x+dirX[i],y+dirY[i])&&!visited[y+dirY[i]][x+dirX[i]]){
			t|=hasLet(x+dirX[i],y+dirY[i],charAt+1);
		}
	}
	visited[y][x]=false;
	return t;
}
int main() {
	scanf("%d %d\n",&n,&q);
	for(int i=0;i<n; i++){
		for(int j=0; j<n; j++){
			scanf("%c ",&in[i][j]);
		}
	}
	for(int i=0; i<q; i++){
		scanf("%s",word);
		memset(visited,false,sizeof(visited));
		bool t=false;
		for(int i=0;i<n; i++){
			for(int j=0; j<n; j++){
				t|=hasLet(i,j,0);
			}
		}
		if(t)printf("good puzzle!\n");
		else printf("bad puzzle!\n");
	}
    return 0;
}
