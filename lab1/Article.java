package lab1;

public class Article{
    private String articleNumber;
    private Provider provider;
    private String nameArticle;

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public void setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }

    public Provider getProvider() {
        return provider;
    }
}
