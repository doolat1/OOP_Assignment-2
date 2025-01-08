class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String category, String size) {
        super(name, price, category);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + ", size='" + size + "'}";
    }
}