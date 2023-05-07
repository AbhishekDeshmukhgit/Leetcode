class FrequencyTracker {
    HashMap<Integer,Integer> h;
    HashMap<Integer,Integer> f;
    
    public FrequencyTracker() {
        h=new HashMap<Integer,Integer>();
        f=new HashMap<Integer,Integer>();
    }
    
    public void add(int number) {
        int freq=h.getOrDefault(number,0);
        h.put(number,h.getOrDefault(number,0)+1);
        int newfreq=freq+1;
        f.put(newfreq,f.getOrDefault(newfreq,0)+1);
        if(freq>0)
        {
            f.put(freq,f.getOrDefault(freq,0)-1);
            if(f.get(freq)==0)
            {
                f.remove(freq);
            }
        }
    }
    
    public void deleteOne(int number) {
        int freq = h.getOrDefault(number, 0);
        if (freq > 0) {
            h.put(number, freq - 1);
            f.put(freq, f.get(freq) - 1);
            if (f.get(freq) == 0) {
                f.remove(freq);
            }
            if (freq > 1) {
                f.put(freq - 1, f.getOrDefault(freq - 1, 0) + 1);
            }
        }
    }
    
    public boolean hasFrequency(int frequency) {
        return f.containsKey(frequency);
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */