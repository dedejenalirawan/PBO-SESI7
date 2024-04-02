/**
 *
 * @author Dede Jenal Irawan
 */
public class MahasiswaKu {
    public static void main(String[] args) {
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("20220040280");
        m.setName("Dede Jenal Irawan");
        m.setClas(22);
        
        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}