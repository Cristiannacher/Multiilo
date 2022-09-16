public class CodiMeu {
    public static void main(String[] args) {
            int n = 24;
            int numHebras = 4;
            int reparto = n/numHebras;
            int idHebra = 3;

            int inicio = reparto*idHebra;
            int fin = inicio +reparto;

            for(int i = inicio; i <fin; i++){
                System.out.println(i);
            }

    }

}
