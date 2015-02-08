/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpeg;

/**
 *
 * @author pihla
 */
public class Node {

        public int frequency;
        int value;
        Node left;
        Node right;

        public Node(int value, int frequency, Node left, Node right) {
            this.frequency = frequency;
            this.value = value;
            this.left = left;
            this.right = right;
        }

        /**
         * Checks if node is leaf
         */
        public boolean isLeaf() {
            if (this.right == null && this.left == null) {
                return true;
            } else {
                return false;
            }
        }
    }
