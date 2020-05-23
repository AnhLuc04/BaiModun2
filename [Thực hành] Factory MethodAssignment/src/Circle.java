public class Circle implements Shape {
        public double pi = 3.14;
        public int rauid;

        public void getRauid() {
            this.rauid = rauid;
        }

        public void getpi() {
            this.pi = pi;
        }

        public void setHight(int rauid) {
            rauid = rauid;
        }

        @Override
        public void draw() {
            double result = (rauid * pi);
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "pi=" + pi +
                    ", rauid=" + rauid +
                    ",result="+toString()+
                    '}';
        }
}
