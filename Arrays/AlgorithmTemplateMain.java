public class AlgorithmTemplateMain {
    public static void main(String[] args) {
        AlgorithmTemplateExecutor aex = new AlgorithmTemplateExecutor();
        aex.acceptTemplate(new MoveZerosToEnd());
        aex.acceptTemplateTwoArray(new UnionOfTwoSortedArrays());
    }
}