package ArbolesBinarios;
/*a) Se dispone de un árbol binario de elementos de tipo entero. Escribir métodos que calculen:
        i) la suma de sus elementos.
        ii) la suma de sus elementos que son múltiplos de 3*/

    public class Ejercicio14<T> {

        private int sum;
        public int elementSum
                (BinaryTree<Integer> a){
            if(!(a.isEmpty())){
                sum += a.getRoot();
            }
            if(!a.getLeft().isEmpty()){
                sum += elementSum(a.getLeft());
            }
            if(!a.getLeft().isEmpty()){
                sum += elementSum(a.getLeft());
            }
            return sum;
        }


        public int elementSum3(BinaryTree<Integer> a){
            if(!(a.isEmpty())){
                sum += a.getRoot();
            }
            if(!a.getLeft().isEmpty()){
                if (elementSum(a.getLeft()) % 3 == 0) {
                    sum += elementSum(a.getLeft());
                }
            }
            if(!a.getLeft().isEmpty()) {
                if (elementSum(a.getLeft()) % 3 == 0) {
                    sum += elementSum(a.getLeft());
                }
            }
            return sum;
        }
}
