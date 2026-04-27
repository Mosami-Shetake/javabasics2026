package datatypes;
import java.util.logging.Level;

public class Non_primitive_datatype {
                enum dept{
                 IT,
                    Netwrok,
                    HR
};

        public static void main(String[] args) {

            String programingLang = "Java";
            System.out.println(programingLang);

            Object str2 = "Java";
            System.out.println(str2);

            String str = new String("Java");
            System.out.println(str);

            System.out.println(programingLang == str);
            System.out.println(str2 == programingLang);

            dept str5 = dept.Netwrok;
            System.out.println(str5);
        }

    }

