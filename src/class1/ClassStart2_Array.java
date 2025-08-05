package class1;

public class ClassStart2_Array {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {15, 16, 17};
        int[] studentGrades = {90, 80, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:"+ studentGrades[i]);
        }

        // 학생 데이터 하나 변경하려고 할 때 배열 세 개에 나뉘어져 있어 피곤해진다고. (1스택)
        // 데이터 변경할 때마다 인덱스 잘못하면 안되니 피곤해진다고. (2스택)
    }
}
