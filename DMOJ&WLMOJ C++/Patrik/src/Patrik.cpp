
//============================================================================
// Name        : Patrik.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <bits/stdc++.h>

using namespace std;
long long in[500001];
int main() {
	int n;
	scanf("%d",&n);
	for(int i=0; i<n; i++)scanf("%lld",&in[i]);
	stack<pair<int,int>> st;
	long long ans=0;
	for(int i=0; i<n; i++){
		int cnt=1;
		while(!st.empty()&&st.top().first<=in[i]){
			ans+=st.top().second;
			if(st.top().first==in[i])cnt+=st.top().second;
			st.pop();
		}
		if(!st.empty())ans++;
		st.push({in[i],cnt});
	}
	printf("%lld",ans);
    return 0;
}
