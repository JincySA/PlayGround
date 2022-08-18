class GFG {
    static String censor(String text,
                         String word) {
        String stars = ;
        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) != ' '){
                stars += '#';
            }else {
                stars += ' ';
            }
        text = text.replaceAll(word,stars);
        return text;
    }

    public static void main(String[] args) {
        String extract = Lorem ipsum dolor sit amet, consectetur adipiscing elit , sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur r adipiscing elit sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum;
        String cen = consectetur adipiscing elit;
        System.out.println(censor(extract, cen));
    }
}
