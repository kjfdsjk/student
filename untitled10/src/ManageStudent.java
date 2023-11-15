
import java.util.ArrayList;
import java.util.List;

public class ManageStudent {
    List<Student> listStudent = new ArrayList<>();
    ManageStudent() {
        listStudent.add(new Student( 1 , "A" , 2 , 3));
    }
    public void addStudent(Student student) {
        listStudent.add(student);
    }

    public void findByName(String name) {
        for (Student student : this.listStudent) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
        }
    }

    public void removeStudent(int id) {
        int index = -1;
        for (int i = 0; i < this.listStudent.size(); i++) {
            if (id == this.listStudent.get(i).getId()) {
                index = i;
            }
        }
        this.listStudent.remove(index);
    }

//    public void findAll(List<Student> students) {
//        System.out.println("Danh sách học sinh hiện tại");
//        for (Student student : students) {
//            printInfomation(student);
//        }
//    }

    public void findAll() {
        for (Student student : this.listStudent) {
            System.out.println(student);
        }
    }

//    private void printInfomation(Student student) {
//        System.out.println("ID học sinh: " + student.id);
//        System.out.println("Tên học sinh: " + student.name);
//        System.out.println("Điểm học sinh: " + student.score);
//        System.out.println("Tuổi học sinh: " + student.age);
//    }

    public void update(int id, Student student) {
//        for (Student student : listStudent) {
//            while (true) {
//                System.out.println("1.ID");
//                System.out.println("2.Tên");
//                System.out.println("3.Điểm");
//                System.out.println("4.Tuổi");
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Nhập ID muốn sửa");
//                int idToChange = scanner.nextInt();
//                scanner.nextLine();
//                if (student.getId() == idToChange) {
//                    int choice = scanner.nextInt();
//                    scanner.nextLine();
//                    switch (choice) {
//                        case 1:
//                            System.out.print("Đổi ID: ");
//                            int newId = scanner.nextInt();
//                            student.setId(newId);
//                            System.out.println("Đã chỉnh sửa thành công!");
//                            break; // Đã tìm thấy và chỉnh sửa, thoát khỏi vòng lặp
//
//                        case 2:
//                            System.out.print("Nhập tên mới: ");
//                            String newName = scanner.nextLine();
//                            student.setName(newName);
//                            System.out.println("Đã chỉnh sửa thành công!");
//                            break; // Đã tìm thấy và chỉnh sửa, thoát khỏi vòng lặp
//
//                        case 3:
//                            System.out.print("Nhập điểm mới: ");
//                            int newScore = scanner.nextInt();
//                            student.setScore(newScore);
//                            System.out.println("Đã chỉnh sửa thành công!");
//                            break;
//                        case 4:
//                            System.out.print("Nhập tuổi mới: ");
//                            int newAge = scanner.nextInt();
//                            student.setAge(newAge);
//                            System.out.println("Đã chỉnh sửa thành công!");
//                            break;
//                    }
//                }
//            }
//        }
//    }f
        int index = -1;
        for (int i = 0; i < this.listStudent.size(); i++) {
            if (id == this.listStudent.get(i).getId()) {
                index = i;
            }
        }
        this.listStudent.set(index, student);
    }


}
