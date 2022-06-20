public class ServerNameGenerator {

    private String[] adjectives = {"decisive", "broad", "loud", "chemical", "fat", "knotty", "huge", "sneaky", "strange", "zonked"};
    private String[] nouns = {"Teapot", "Grandma", "Craft", "High", "Mint", "Professor", "Painter", "Prize", "Salute", "Club"};

    public String[] getAdjectives() {
        return adjectives;
    }

    public void setAdjectives(String[] adjectives) {
        this.adjectives = adjectives;
    }

    public String[] getNouns() {
        return nouns;
    }

    public void setNouns(String[] nouns) {
        this.nouns = nouns;
    }

    private static String getStringInArray(String[] arrayOfStrings){
        return arrayOfStrings[(int) Math.ceil(Math.random() * arrayOfStrings.length-1)];
    }

    public static void main(String[] args) {
        ServerNameGenerator serverNameGenerator = new ServerNameGenerator();
        System.out.println("Your server name is:");
        String noun = getStringInArray(serverNameGenerator.getNouns());
        String adjective = getStringInArray(serverNameGenerator.getAdjectives());
        System.out.printf("%s %s%n", adjective, noun);
    }
}
