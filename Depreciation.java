public class Depreciation {
    public static void main(String[] args) {
        float V1 = 200, R = 10, T = 2;
        System.out.print(Depreciation(V1, R, T));
    }
    static float Depreciation(float v, float r, float t)
    {
        
        float v2 = (float)(v * Math.pow((1 - r / 100), t));
 
        return v2;
    }
}
