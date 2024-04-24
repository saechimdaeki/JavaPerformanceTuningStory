package chap08;

public class ContributeTest {
    public static void main(String[] args) {
        Contributor[] crs = new Contributor[10];
        for (int i = 0; i < 10; i ++) {
            Contribution group = new Contribution();
            crs[i] = new Contributor(group, "Contributor" + i);
        }

        // 기부 실행
        for (int i = 0; i < 10; i ++) {
            crs[i].start();
        }
    }
}
