public class Main {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade)
        {
            case 'A':
                System.out.println("Mükemmel Geçtiniz");
                break;
            case 'B':

            case 'C':
                System.out.println("iyi Geçtiniz");
                break;
            case 'D':
                System.out.println("fena değil Geçtiniz");
                break;
            case 'F':
                System.out.println("malesef kaldınız");
                break;
            default:
                System.out.println("geçersiz not girdiniz");
        }



    }
}