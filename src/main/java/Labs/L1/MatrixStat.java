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
            System.out.println(sum);
        }
        public void MiddleValue(){
            int sum = 0;
            for (int i = 0; i < m.ReadMatrix().size(); i++) {
                for (int j = 0; j <  m.ReadMatrix().get(i).size(); j++) {
                    sum +=m.ReadMatrix().get(i).get(j);
                }
            }
            System.out.println(sum/(m.ColumnNumber()*m.LineNumber()));
        }
        public void MaxValue(){
            int max = 0;
            for (int i = 0; i < m.ReadMatrix().size(); i++) {
                for (int j = 0; j <  m.ReadMatrix().get(i).size(); j++) {
                    if(max < m.ReadMatrix().get(i).get(j))
                        max =m.ReadMatrix().get(i).get(j);
                }
            }
            System.out.println(max);
        }
        public void NotNull(){
            int counter = 0;
            for (int i = 0; i < m.ReadMatrix().size(); i++) {
                for (int j = 0; j <  m.ReadMatrix().get(i).size(); j++) {
                    if(m.ReadMatrix().get(i).get(j) != 0 )
                        counter++;
                }
            }
            System.out.println(counter);
        }
        public void Do(){
            MaxValue();
            MiddleValue();
            Sum();
            NotNull();
        }
}

