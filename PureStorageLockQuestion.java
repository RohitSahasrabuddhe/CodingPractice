static int check_log_history(List<String> events) {
        // We can use stack to implement this problem
        LinkedList<Integer> stack = new LinkedList<Integer>();
        int i;
        for (i = 0 ; i < events.size(); i++) {
            String current = events.get(i);
            
            String[] parts = current.split(" ");
            
            if (parts[0].equals("ACQUIRE")) {
                // PUSH onto the stack
                int val = Integer.parseInt(parts[1]);
                // checking through the stack
                
                for (int j = 0 ; j < stack.size(); j++)
                {
                    if (val == stack.get(j)) {
                        return i+1;
                    }
                }                
                stack.addFirst(val);
            }
            else {
                // POP from stack
                // Popped value is not equal to release value return the i+1
                int val = Integer.parseInt(parts[1]);
                if (stack.size() > 0){
                   
                    int poppedVal = stack.removeFirst();
                    if (val != poppedVal) {
                        return i+1;
                    }
                }
            }
            
        }
        if (stack.size() > 0){
                return i+1;
            }
        
        // If everything goes well return 0
        return 0;

    }


