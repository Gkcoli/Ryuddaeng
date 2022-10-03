class Channel {
    public static void main(String[] args) {
  
      int number = 1;
      String channel;
  
      switch (number) {
  
        case 1:
          channel = "121 NBATV";
          break;
  
        case 2:
          channel = "71 HBO";
          break;
  
        case 3:
          channel = "54 CARTOON NETWORK";
          break;
  
        case 4:
          channel = "131 HISTORY CHANNEL";
          break;

        case 5:
         channel = "52 NICKELODEON";
         break;
        
        default:
          channel = "Unknown Channel";
          break;
  
      }
      System.out.println("Channel:" + channel);
    }
  }
