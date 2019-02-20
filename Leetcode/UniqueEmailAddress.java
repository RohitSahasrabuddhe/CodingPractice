class Solution {
    public int numUniqueEmailsSimpleApproach(String[] emails) {
        HashSet<String> s = new HashSet<String>();
        
        for (int i = 0; i < emails.length; i++) {
            // got one email
            String id = processEmailId(emails[i]);
            System.out.println(id);
            s.add(id);
        }
        
        return s.size();
    }
    
    public String processEmailId(String email) {
        String[] parts = email.split("@");
        
        String local = parts[0];
        String domain = parts[1];
        
        // proces local
        System.out.println("Local : " + local);
        local = local.replace(".","");
        String[] trunc = local.split("\\+");
        System.out.println("Local : " + trunc[0]);
        return trunc[0] + "@" + domain;
    }
}