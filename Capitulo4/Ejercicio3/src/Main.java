public class Main {

    public static void main(String[] args){

        double AtlantaX = 33.7489954;
        double AtlantaY = -84.3879824;
        double OrlandoX = 28.5383355;
        double OrlandoY = -81.3792365;
        double SavannahX = 32.0835407;
        double SavannahY = -81.0998342;
        double CharlotteX = 35.2270869;
        double CharlotteY = -80.8431267;

        double r = 6371.01;
        double ax = Math.toRadians(AtlantaX);
        double ay = Math.toRadians(AtlantaY);
        double ox = Math.toRadians(OrlandoX);
        double oy = Math.toRadians(OrlandoY);
        double sx = Math.toRadians(SavannahX);
        double sy = Math.toRadians(SavannahY);
        double cx = Math.toRadians(CharlotteX);
        double cy = Math.toRadians(CharlotteY);

        double dAO = r * Math.acos(Math.sin(ax) * Math.sin(ox) + Math.cos(ax) * Math.cos(ox) * Math.cos(ay - oy));
        double dOS = r * Math.acos(Math.sin(sx) * Math.sin(ox) + Math.cos(sx) * Math.cos(ox) * Math.cos(oy - sy));
        double dSA = r * Math.acos(Math.sin(sx) * Math.sin(ax) + Math.cos(sx) * Math.cos(ax) * Math.cos(sy - ay));
        double dAC = r * Math.acos(Math.sin(cx) * Math.sin(ax) + Math.cos(cx) * Math.cos(ax) * Math.cos(ay - cy));
        double dCS = r * Math.acos(Math.sin(cx) * Math.sin(sx) + Math.cos(cx) * Math.cos(sx) * Math.cos(cy - sy));

        double s1 = (dAO + dOS + dSA) / 2;
        double area1 = Math.sqrt(s1 * (s1 - dAO) * (s1 - dOS) * (s1 - dSA));
        double s2 = (dAC + dCS + dSA) / 2;
        double area2 = Math.sqrt(s2 * (s2 - dAC) * (s2 - dCS) * (s2 - dSA));

        double area = area1 + area2;
        System.out.println("The area is " + area);
    }
}
