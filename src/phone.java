public class phone {
    private String mobile;
    private int price;
    private int ram;

    public phone(String mobile, int price, int ram) {
        this.mobile = mobile;
        this.price = price;
        this.ram = ram;
    }
    public String getMobile(){
        return mobile;
    }
    public int getPrice(){
        return price;
    }
    public int getRam(){
        return ram;
    }

    @Override
    public String toString() {
        return "phone{" +
                "mobile='" + mobile + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }
}
