public class Genus
{
    private String genus;

    public Genus(String g) {
        this.genus = g;
    }

    public void setGenusName(String g) {
        this.genus = g;
    }

    public String getGenusName() {
        return genus;
    }

    @Override
    public String toString() {
        return "Genus{" +
                "genus='" + genus + '\'' +
                '}';
    }
}
