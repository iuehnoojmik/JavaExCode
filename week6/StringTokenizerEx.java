import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("全辨悼/厘拳/全访/尼零/葡零", "/");
		while (st.hasMoreTokens()) 
			System.out.println(st.nextToken());
	}
}
