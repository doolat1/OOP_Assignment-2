class Electronics extends Product {
    private int warrantyYears;

    public Electronics(String name, double price, String category, int warrantyYears) {
        super(name, price, category);
        this.warrantyYears = warrantyYears;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    @Override
    public String toString() {
        return super.toString() + ", warrantyYears=" + warrantyYears + " years}";
    }
}