/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package temp123;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

/**
 *
 * @author Joshua
 */


public class Temp123 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
//        for(int i=0x1ff00; i<=0x1ffff; i++){
//            System.out.printf("'%c',",(char)i);
//        }
        String a="軔";
        System.out.printf("%x %x\n",(int)a.charAt(0),(int)a.charAt(1) );
        
//        for(int i=0xff00; i<=0xffff; i++){
//            System.out.printf("'%c',",(char)i);
//        }
    }
    static String cFrom10(int base, String val){
        //char b[]={'È','É','Ê','Ë','Ì','Í','Î','Ï','Ð','Ñ','Ò','Ó','Ô','Õ','Ö','×','Ø','Ù','Ú','Û','Ü','Ý','Þ','ß','à','á','â','ã','ä','å','æ','ç','è','é','ê','ë','ì','í','î','ï','ð','ñ','ò','ó','ô','õ','ö','÷','ø','ù','ú','û','ü','ý','þ','ÿ','Ā','ā','Ă','ă','Ą','ą','Ć','ć','Ĉ','ĉ','Ċ','ċ','Č','č','Ď','ď','Đ','đ','Ē','ē','Ĕ','ĕ','Ė','ė','Ę','ę','Ě','ě','Ĝ','ĝ','Ğ','ğ','Ġ','ġ','Ģ','ģ','Ĥ','ĥ','Ħ','ħ','Ĩ','ĩ','Ī','ī','Ĭ','ĭ','Į','į','İ','ı','Ĳ','ĳ','Ĵ','ĵ','Ķ','ķ','ĸ','Ĺ','ĺ','Ļ','ļ','Ľ','ľ','Ŀ','ŀ','Ł','ł','Ń','ń','Ņ','ņ','Ň','ň','ŉ','Ŋ','ŋ','Ō','ō','Ŏ','ŏ','Ő','ő','Œ','œ','Ŕ','ŕ','Ŗ','ŗ','Ř','ř','Ś','ś','Ŝ','ŝ','Ş','ş','Š','š','Ţ','ţ','Ť','ť','Ŧ','ŧ','Ũ','ũ','Ū','ū','Ŭ','ŭ','Ů','ů','Ű','ű','Ų','ų','Ŵ','ŵ','Ŷ','ŷ','Ÿ','Ź','ź','Ż','ż','Ž','ž','ſ','ƀ','Ɓ','Ƃ','ƃ','Ƅ','ƅ','Ɔ','Ƈ','ƈ','Ɖ','Ɗ','Ƌ','ƌ','ƍ','Ǝ','Ə','Ɛ','Ƒ','ƒ','Ɠ','Ɣ','ƕ','Ɩ','Ɨ','Ƙ','ƙ','ƚ','ƛ','Ɯ','Ɲ','ƞ','Ɵ','Ơ','ơ','Ƣ','ƣ','Ƥ','ƥ','Ʀ','Ƨ','ƨ','Ʃ','ƪ','ƫ','Ƭ','ƭ','Ʈ','Ư','ư','Ʊ','Ʋ','Ƴ','ƴ','Ƶ','ƶ','Ʒ','Ƹ','ƹ','ƺ','ƻ','Ƽ','ƽ','ƾ','ƿ','ǀ','ǁ','ǂ','ǃ','Ǆ','ǅ','ǆ','Ǉ','ǈ','ǉ','Ǌ','ǋ','ǌ','Ǎ','ǎ','Ǐ','ǐ','Ǒ','ǒ','Ǔ','ǔ','Ǖ','ǖ','Ǘ','ǘ','Ǚ','ǚ','Ǜ','ǜ','ǝ','Ǟ','ǟ','Ǡ','ǡ','Ǣ','ǣ','Ǥ','ǥ','Ǧ','ǧ','Ǩ','ǩ','Ǫ','ǫ','Ǭ','ǭ','Ǯ','ǯ','ǰ','Ǳ','ǲ','ǳ','Ǵ','ǵ','Ƕ','Ƿ','Ǹ','ǹ','Ǻ','ǻ','Ǽ','ǽ','Ǿ','ǿ','Ȁ','ȁ','Ȃ','ȃ','Ȅ','ȅ','Ȇ','ȇ','Ȉ','ȉ','Ȋ','ȋ','Ȍ','ȍ','Ȏ','ȏ','Ȑ','ȑ','Ȓ','ȓ','Ȕ','ȕ','Ȗ','ȗ','Ș','ș','Ț','ț','Ȝ','ȝ','Ȟ','ȟ','Ƞ','ȡ','Ȣ','ȣ','Ȥ','ȥ','Ȧ','ȧ','Ȩ','ȩ','Ȫ','ȫ','Ȭ','ȭ','Ȯ','ȯ','Ȱ','ȱ','Ȳ','ȳ','ȴ','ȵ','ȶ','ȷ','ȸ','ȹ','Ⱥ','Ȼ','ȼ','Ƚ','Ⱦ','ȿ','ɀ','Ɂ','ɂ','Ƀ','Ʉ','Ʌ','Ɇ','ɇ','Ɉ','ɉ','Ɋ','ɋ','Ɍ','ɍ','Ɏ','ɏ','ɐ','ɑ','ɒ','ɓ','ɔ','ɕ','ɖ','ɗ','ɘ','ə','ɚ','ɛ','ɜ','ɝ','ɞ','ɟ','ɠ','ɡ','ɢ','ɣ','ɤ','ɥ','ɦ','ɧ','ɨ','ɩ','ɪ','ɫ','ɬ','ɭ','ɮ','ɯ','ɰ','ɱ','ɲ','ɳ','ɴ','ɵ','ɶ','ɷ','ɸ','ɹ','ɺ','ɻ','ɼ','ɽ','ɾ','ɿ','ʀ','ʁ','ʂ','ʃ','ʄ','ʅ','ʆ','ʇ','ʈ','ʉ','ʊ','ʋ','ʌ','ʍ','ʎ','ʏ','ʐ','ʑ','ʒ','ʓ','ʔ','ʕ','ʖ','ʗ','ʘ','ʙ','ʚ','ʛ','ʜ','ʝ','ʞ','ʟ','ʠ','ʡ','ʢ','ʣ','ʤ','ʥ','ʦ','ʧ','ʨ','ʩ','ʪ','ʫ','ʬ','ʭ','ʮ','ʯ','ʰ','ʱ','ʲ','ʳ','ʴ','ʵ','ʶ','ʷ','ʸ','ʹ','ʺ','ʻ','ʼ','ʽ','ʾ','ʿ','ˀ','ˁ','˂','˃','˄','˅','ˆ','ˇ','ˈ','ˉ','ˊ','ˋ','ˌ','ˍ','ˎ','ˏ','ː','ˑ','˒','˓','˔','˕','˖','˗','˘','˙','˚','˛','˜','˝','˞','˟','ˠ','ˡ','ˢ','ˣ','ˤ','˥','˦','˧','˨','˩','˪','˫','ˬ','˭','ˮ','˯','˰','˱','˲','˳','˴','˵','˶','˷','˸','˹','˺','˻','˼','˽','˾','˿','̀','́','̂','̃','̄','̅','̆','̇','̈','̉','̊','̋','̌','̍','̎','̏','̐','̑','̒','̓','̔','̕','̖','̗','̘','̙','̚','̛','̜','̝','̞','̟','̠','̡','̢','̣','̤','̥','̦','̧','̨','̩','̪','̫','̬','̭','̮','̯','̰','̱','̲','̳','̴','̵','̶','̷','̸','̹','̺','̻','̼','̽','̾','̿','̀','́','͂','̓','̈́','ͅ','͆','͇','͈','͉','͊','͋','͌','͍','͎','͏','͐','͑','͒','͓','͔','͕','͖','͗','͘','͙','͚','͛','͜','͝','͞','͟','͠','͡','͢','ͣ','ͤ','ͥ','ͦ','ͧ','ͨ','ͩ','ͪ','ͫ','ͬ','ͭ','ͮ','ͯ','Ͱ','ͱ','Ͳ','ͳ','ʹ','͵','Ͷ','ͷ','͸','͹','ͺ','ͻ','ͼ','ͽ',';','Ϳ','΀','΁','΂','΃','΄','΅','Ά','·','Έ','Ή','Ί','΋','Ό','΍','Ύ','Ώ','ΐ','Α','Β','Γ','Δ','Ε','Ζ','Η','Θ','Ι','Κ','Λ','Μ','Ν','Ξ','Ο','Π','Ρ','΢','Σ','Τ','Υ','Φ','Χ','Ψ','Ω','Ϊ','Ϋ','ά','έ','ή','ί','ΰ','α','β','γ','δ','ε','ζ','η','θ','ι','κ','λ','μ','ν','ξ','ο','π','ρ','ς','σ','τ','υ','φ','χ','ψ','ω','ϊ','ϋ','ό','ύ','ώ','Ϗ','ϐ','ϑ','ϒ','ϓ','ϔ','ϕ','ϖ','ϗ','Ϙ','ϙ','Ϛ','ϛ','Ϝ','ϝ','Ϟ','ϟ','Ϡ','ϡ','Ϣ','ϣ','Ϥ','ϥ','Ϧ','ϧ','Ϩ','ϩ','Ϫ','ϫ','Ϭ','ϭ','Ϯ','ϯ','ϰ','ϱ','ϲ','ϳ','ϴ','ϵ','϶','Ϸ','ϸ','Ϲ','Ϻ','ϻ','ϼ','Ͻ','Ͼ','Ͽ','Ѐ','Ё','Ђ','Ѓ','Є','Ѕ','І','Ї','Ј','Љ','Њ','Ћ','Ќ','Ѝ','Ў','Џ','А','Б','В','Г','Д','Е','Ж','З','И','Й','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я','а','б','в','г','д','е','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я','ѐ','ё','ђ','ѓ','є','ѕ','і','ї','ј','љ','њ','ћ','ќ','ѝ','ў','џ','Ѡ','ѡ','Ѣ','ѣ','Ѥ','ѥ','Ѧ','ѧ','Ѩ','ѩ','Ѫ','ѫ','Ѭ','ѭ','Ѯ','ѯ','Ѱ','ѱ','Ѳ','ѳ','Ѵ','ѵ','Ѷ','ѷ','Ѹ','ѹ','Ѻ','ѻ','Ѽ','ѽ','Ѿ','ѿ','Ҁ','ҁ','҂','҃','҄','҅','҆','҇','҈','҉','Ҋ','ҋ','Ҍ','ҍ','Ҏ','ҏ','Ґ','ґ','Ғ','ғ','Ҕ','ҕ','Җ','җ','Ҙ','ҙ','Қ','қ','Ҝ','ҝ','Ҟ','ҟ','Ҡ','ҡ','Ң','ң','Ҥ','ҥ','Ҧ','ҧ','Ҩ','ҩ','Ҫ','ҫ','Ҭ','ҭ','Ү','ү'};
        BigInteger v = new BigInteger(val);
        String out="";
        while(!v.equals(new BigInteger("0"))){
            out=(char)(93+v.remainder(BigInteger.valueOf(base)).intValue())+out;
            v=v.divide(BigInteger.valueOf(base));
        }
        return out;
    }
    static String cTo10(int base, String v){
        BigInteger a = new BigInteger(Integer.toString(v.charAt(0)-93));
        for(int i=1; i<v.length(); i++){
            a=a.multiply(BigInteger.valueOf(base));
            a=a.add(BigInteger.valueOf(v.charAt(i)-93));
        }
        return a.toString(3);
//        int i=0;
//        BigInteger out = new BigInteger("0");
//        BigInteger a;
//        while(i<val.length()){
//            long b=val.charAt(val.length()-i-1)-93;
//            a=new BigInteger(Integer.toString(base));
//            a=a.pow(i);
//            a=a.multiply(BigInteger.valueOf(b));
//            i++;
//            out=out.add(a);
//        }
//        return out.toString(3);
    }


    static String next () throws IOException {
        if (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
         return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
         return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
          return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}
