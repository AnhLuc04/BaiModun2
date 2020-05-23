package b1;

public class StopSwatch {
    public static class StopWatch {
        private long startTime;
        private long endTime;

        public long getEndTime() {
            return endTime;
        }

        public long getStartTime() {
            return startTime;
        }

        public StopWatch() {

            this.startTime = System.currentTimeMillis();
        }

        public void start() {
            this.startTime = System.currentTimeMillis();
        }

        public void stop() {
            this.endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return this.endTime - this.startTime;
        }

    }
}
