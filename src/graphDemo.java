public class graphDemo {
    int n;
    int[][] ar;

    public graphDemo(int n){
        this.n=n;
        ar = new int[n][n];
    }
    public void addEdge(int u, int v){
        ar[u][v]=1;
        ar[v][u]=1;
    }
    public void removeEdge(int u, int v){
        ar[u][v]=0;
        ar[v][u]=0;
    }
    public void printgraph(){
        for(int i =0; i<n;i++){
            for(int j=0; j<n; j++){
                System.out.print((ar[i][j])+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        graphDemo ob = new graphDemo(5);
        ob.addEdge(0,1);
        ob.addEdge(0,2);
        ob.addEdge(0,3);
        ob.printgraph();
        System.out.println(" ");
        ob.removeEdge(0,1);
        ob.printgraph();
    }
}
