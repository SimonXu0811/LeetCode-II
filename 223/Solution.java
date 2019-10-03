class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C - A) * (D - B);//两个矩形的面积
        int area2 = (G - E) * (H - F);
        
        if(A >= G || B >= H || C <= E || D <= F) return area1 + area2; //如果不重合的话
        
        int len = Math.min(C, G) - Math.max(A, E);
        int hei = Math.min(D, H) - Math.max(B, F);
        
        return area1 + area2 - len*hei;//减去重合面积
    }
}
