import java.util.List;

public class itemsMaching {
    public static void main(String[] args) {
    String[][]  items = new String[][] {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
    String ruleKey;
    String ruleValue;
    System.out.println(countMatches(items,ruleKey,ruleValue));
    
    
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i = 0; i < items.size(); i++){
            if(ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0)))
                count++;
            else if (ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1)))
                count++;
            else if (ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2)))
                count++;
        }
        return count;
    }


}


