package inheritance;


    class phone {


        void call() {
            System.out.println("Calling");
        }

        void receivecall() {
            System.out.println("Receiving Call");
        }
    }


    class smartphone extends phone {
        void browseinternet() {
            System.out.println("Browsing net");
        }

        void takephoto() {
            System.out.println("Taking Photo");
        }
    }

    public class singleinheritance {
        public static void main(String[] args) {
            smartphone sp = new smartphone();
            sp.call();
            sp.receivecall();
            sp.browseinternet();
            sp.takephoto();
        }

    }


