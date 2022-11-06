package edu.sdccd.cisc191;

public class BinarySearchTree {
    /**
     * Recursively finds the needle in the Binary Search Tree (BST) haystack
     * @param root which node to start searching from
     * @param needle the data to search for
     * @return the first BSTNode containing the needle, null if doesn't exist
     */



    public BSTNode contains(BSTNode root, String needle) {
        // TODO: fill this out, you can choose any order of traversal
        if (root == null) {
            return null;
        }
        int needVal= needle.compareTo(root.getData());// storing the comparisin value

        if (needVal==0) { // if the value is 0 we know that we have a match
            return root;
        }
        if (needVal<0) {
            return contains(root.getLeft(), needle);// if its less then 0 we know that we have to serch the left side of the tree

        }
        else {
            return contains(root.getRight(),needle); // we return the vlaeu that we havent serched yet




        }



    }

    /**
     * Recursively converts a String array to Binary Search Tree (BST)
     * @param array the array of Strings to import into the BST
     * @param start index in the array to begin importing
     * @param end index in the array to stop importing
     * @return the root node of the generated BST
     */
    public BSTNode fromArray(String[] array, int start, int end) {
        if (start>end) { // Checking when we are at the end of the tree
            return null;

        }
        else {
            int split =(start+end)/2;

            BSTNode node = new BSTNode(array[split]);

            node.setRight((fromArray(array,split+1,end))); // takes all values above split and makes a subtree to the right

            node.setLeft((fromArray(array,start,split-1)));// same thing

            return node;





        }


    }
}