//{ Driver Code Starts
import java.io.*;
import java.util.*;


class short_dist
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];
        
        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }
        
        return mat;
    }
    
    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 2);
            
            
            int[][] mat = IntMatrix.input(br, a[0], a[1]);
            
            Solution obj = new Solution();
            int res = obj.findShortestPath(mat);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int short_dist(int[][] mat) {
        // code here
        public static int findShortestPath(int[][] mat) {
        int R = mat.length;
        int C = mat[0].length;

        int[][] dist = new int[R][C];
        for (int i = 0; i < R; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        dist[0][0] = mat[0][0];

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));
        pq.offer(new int[]{0, 0, dist[0][0]});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int x = current[0];
            int y = current[1];
            int d = current[2];

            if (d > dist[x][y]) continue;

            for (int k = 0; k < 4; ++k) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                    if (dist[x][y] + mat[nx][ny] < dist[nx][ny]) {
                        dist[nx][ny] = dist[x][y] + mat[nx][ny];
                        pq.offer(new int[]{nx, ny, dist[nx][ny]});
                    }
                }
            }
        }
        return dist[R - 1][C - 1];
    }
}
        
