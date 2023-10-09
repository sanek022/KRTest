package Labs.L1;

public class MatrixStat {
        Matrix m;
        public MatrixStat(Matrix m) {
            this.m = m;
        }
        public void Sum(){
            int sum = 0;
            for (int i = 0; i < m.ReadMatrix().size(); i++) {
                for (int j = 0; j <  m.ReadMatrix().get(i).size(); j++) {
                    sum +=m.ReadMatrix().get(i).get(j);
                }
            }
            System.out.println("Sum value = " + sum);
        }
        public void MiddleValue(){
            double sum = 0;
            int counter = 0;
            for (int i = 0; i < m.ReadMatrix().size(); i++) {
                for (int j = 0; j <  m.ReadMatrix().get(i).size(); j++) {
                    sum +=m.ReadMatrix().get(i).get(j);
                    counter++;
                }
            }
            String str = String.format("%.2f",sum / counter);
            System.out.println("Middle value = " + str);
        }
        public void MaxValue(){
            int max = 0;
            for (int i = 0; i < m.ReadMatrix().size(); i++) {
                for (int j = 0; j <  m.ReadMatrix().get(i).size(); j++) {
                    if(max < m.ReadMatrix().get(i).get(j))
                        max =m.ReadMatrix().get(i).get(j);
                }
            }
            System.out.println("Max value = " + max);
        }
        public void NotNull(){
            int counter = 0;
            for (int i = 0; i < m.ReadMatrix().size(); i++) {
                for (int j = 0; j <  m.ReadMatrix().get(i).size(); j++) {
                    if(m.ReadMatrix().get(i).get(j) != 0 )
                        counter++;
                }
            }
            System.out.println("NotNull = " + counter);
        }
        public void Do(){
            MaxValue();
            MiddleValue();
            Sum();
            NotNull();
        }
}

