class SnapshotArray {
    private int hash(int a, int b){
        return (a+b+1)*(a+b)/2+b;
    }
    private int length = 0;
    private int id = 0;
    private HashMap<Integer, Integer> m = new HashMap<>();
    public SnapshotArray(int length) {
        this.length = length;
    }
    
    public void set(int index, int val) {
        this.m.put(hash(id, index), val);
    }
    
    public int snap() {
        this.id++;
        return this.id - 1;
    }
    
    public int get(int index, int snap_id) {
        while(snap_id>=0){
            int hash = this.hash(snap_id, index);
            if(m.containsKey(hash)){
                return this.m.get(hash);
            }
            snap_id--;
        }
        return 0;
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */