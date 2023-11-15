import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm mới");
            System.out.println("2. sửa");
            System.out.println("3. Xoá");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Tìm kiếm heo tên");
            System.out.println("8. Thoát khỏi chương trình");

            System.out.println("chọn");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập ID");
                    int newId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên");
                    String newName = scanner.nextLine();
                    System.out.println("Nhập điểm");
                    int newScore = scanner.nextInt();
                    System.out.println("Nhập tuổi");
                    int newAge = scanner.nextInt();
                    manageStudent.addStudent(new Student(newId, newName, newScore, newAge));
                    break;
                case 2:
                    System.out.println("Nhâp ID muốn sửa: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    manageStudent.update(updateId, new Student());
                    break;
                case 3:
                    System.out.println("Nhập ID muốn xóa: ");
                    int removeId = scanner.nextInt();
                    manageStudent.removeStudent(removeId);
                    break;
                case 4:
                    System.out.println("Danh sách hiện có");
                    manageStudent.findAll();
                    break;
                case 5:
                    System.out.println("Nhập tên muốn tìm:");
                    String findName = scanner.nextLine();
                    manageStudent.findByName(findName);
                    break;
                case 6:
                    break;
            }
        }
    }
}