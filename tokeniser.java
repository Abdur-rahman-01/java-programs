import java.util.StringTokenizer;
public class tokeniser {
    public static void main(String[] args) {
    StringTokenizer st=new StringTokenizer("Methodist College of engineering and technology");
    while(st.hasMoreTokens()){
     System.out.println(st.nextToken());
    }
    }
}
