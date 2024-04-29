package exam01;

public enum Transportation {
    BUS(1400) {
        public int getTotal(int person) {
            return getFare() * person;
        }
    }, // 매개변수가 있는 생성자

    SUBWAY(4500){
        public int getTotal(int person) {
            return getFare() * person;
        }
    },

    TAXI(1300){
        public int getTotal(int person) {
            return getFare() * person;
        }
    };

    private final int fare;

    Transportation(int fare) {
        this.fare = fare;
    }

    //fare를 조회할 수 있는 메서드 생성
    public int getFare() {
        return fare;
    }

   public abstract int getTotal(int person); // 추상 메서드 추가



}
