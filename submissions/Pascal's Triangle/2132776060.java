# Title: Pascal's Triangle
# Submission ID: 2132776060
# Status: Accepted
# Date: 6 September 2026 at 16:53:30 GMT+5:30

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (i < 2) {
                    row.add(1);
                } else {
                    if(j == 0 || j == i) {
                        row.add(1);
                    } else {
                        List<Integer> aboveMat = matrix.get(i - 1);
                        row.add(aboveMat.get(j - 1) + aboveMat.get(j));
                    }
                }
            }
            matrix.add(row);
        }

        return matrix;
    }
}