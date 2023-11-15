import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ManageStudent {
    private List<Student> listStudent;

    public ManageStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public void addStudent(Student student) {
        listStudent.add(student);
    }

    public void removeStudent(String name) {
        Iterator<Student> iterator = listStudent.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals(name)) {
                iterator.remove();
                System.out.println("Đã xóa");
                return;
            }
        }
    }

    public void findAll(List<Student> students) {
        System.out.println("Danh sách học sinh hiện tại");
        for (Student student : students) {
            printInfomation(student);
        }
    }

    private void printInfomation(Student student) {
        System.out.println("ID học sinh: " + student.id);
        System.out.println("Tên học sinh: " + student.name);
        System.out.println("Điểm học sinh: " + student.score);
        System.out.println("Tuổi học sinh: " + student.age);
    }

    public void update() {
        for (Student student : listStudent) {
            while (true) {
                System.out.println("1.ID");
                System.out.println("1.Tên");
                System.out.println("1.Điểm");
                System.out.println("1.Tuổi");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập ID muốn sửa");
                int idToChange = scanner.nextInt();
                if (student.getId() == idToChange) {
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.print("Đổi ID: ");
                            int newId = scanner.nextInt();
                            student.setId(newId);
                            System.out.println("Đã chỉnh sửa thành công!");
                            break; // Đã tìm thấy và chỉnh sửa, thoát khỏi vòng lặp

                        case 2:
                            System.out.print("Nhập tên mới: ");
                            String newName = scanner.nextLine();
                            student.setName(newName);
                            System.out.println("Đã chỉnh sửa thành công!");
                            break; // Đã tìm thấy và chỉnh sửa, thoát khỏi vòng lặp

                        case 3:
                                System.out.print("Nhập điểm mới: ");
                                int newScore = scanner.nextInt();
                                student.setScore(newScore);
                                System.out.println("Đã chỉnh sửa thành công!");
                                break;
                        case 4:
                            System.out.print("Nhập tuổi mới: ");
                            int newAge = scanner.nextInt();
                            student.setAge(newAge);
                            System.out.println("Đã chỉnh sửa thành công!");
                            break;
                    }
                }
            }
        }
    }
}
