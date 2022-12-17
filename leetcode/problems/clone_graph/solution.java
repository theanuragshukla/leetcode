/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
        HashMap<Node, Node> m = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null){
            return node;
        }
        Node ret = new Node(node.val);
        m.put(node, ret);
        if(node.neighbors.size()!=0){
        for(Node n : node.neighbors){
            if(!m.containsKey(n)){
          Node temp = cloneGraph(n);
          m.put(n, temp);
          ret.neighbors.add(temp);
        } else {
            ret.neighbors.add(m.get(n));
        }
         }   
        }
        return ret;
    
    }
}