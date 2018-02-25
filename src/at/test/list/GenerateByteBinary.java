package at.test.list;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Random;

public class GenerateByteBinary {
    
    public int[] bytearray2intarray(byte[] barray)
 {
   int[] iarray = new int[barray.length];
   int i = 0;
   for (byte b : barray)
       iarray[i++] = b & 0xff;
   return iarray;
 }

	public String generateByteBinary(String line) {
		String[] arrayRead = line.split("\\s+");
		int count = Integer.parseInt(arrayRead[0]);
		String tag = arrayRead[2];
//                int lowerLimit = Integer.parseInt(arrayRead[2]);
//		int upperLimit = Integer.parseInt(arrayRead[2]);
                String outText = "";
		int randomValue;
                int i;
               if(tag.equalsIgnoreCase("constant"))
               {
                   for(i=3;i<count+3;i++)
                   {
                      //String s1 = String.format("%8s", Integer.toBinaryString(Integer.parseInt(arrayRead[i],16) & 0xFF)).replace(' ', '0');
        byte[] bytes = arrayRead[i].getBytes() ;
        int[] iarray=bytearray2intarray(bytes);
                for (Integer n:iarray)
        
                      // System.out.println(Integer.toBinaryString(n));
                      outText += Integer.toBinaryString(n)+" ";
                   }
                   
               }
               else
               {
                   if(arrayRead.length>3)
                   {
                         int lowerLimit = Integer.parseInt(arrayRead[3]);
		         int upperLimit = Integer.parseInt(arrayRead[4]);
                         
                         for ( i = 0; i < count;i++) {
			Random rand = new Random();

			randomValue = (lowerLimit) + rand.nextInt((upperLimit - lowerLimit) + 1);
String s1 = String.format("%8s", Integer.toBinaryString(randomValue & 0xFF)).replace(' ', '0');
                        
			 outText +=  s1+" ";
//			byte[] bytes = ByteBuffer.allocate(4).putInt(randomValue).array();
//			for(int j = 0; j < 4; j++) {
//				outText += String.format("0x%X ", bytes[j]);
//			}

//			if (++i == count)
//				break;
//			else if (i % 1 == 0)
//				outText += "\n";
//			else
//				outText += " ";
		}
                         
                   }
                   else
                   {
                       
                        for ( i = 0; i < count;i++) {
			Random rand = new Random();
String s1 = String.format("%8s", Integer.toBinaryString(rand.nextInt() & 0xFF)).replace(' ', '0');
			 outText +=  s1+" ";
                        }
                   }
                   
               }

		
		
		outText.trim();
		return outText;
	}
        
      

	public String generateByte(String line) {
		String[] arrayRead = line.split("\\s+");
		int count = Integer.parseInt(arrayRead[0]);
		String tag = arrayRead[2];
//                int lowerLimit = Integer.parseInt(arrayRead[2]);
//		int upperLimit = Integer.parseInt(arrayRead[2]);
                String outText = "";
		int randomValue;
                int i;
               if(tag.equalsIgnoreCase("constant"))
               {
                   for(i=3;i<count+3;i++)
                   {
                       //String s1 = String.format("%8s", Integer.toBinaryString(Integer.parseInt(arrayRead[i]) & 0xFF)).replace(' ', '0');
                       outText += arrayRead[i]+" ";
                   }
                   outText +="\n";
               }
               else
               {
                   if(arrayRead.length>3)
                   {
                         int lowerLimit = Integer.parseInt(arrayRead[3]);
		         int upperLimit = Integer.parseInt(arrayRead[4]);
                         
                         for ( i = 0; i < count;i++) {
			Random rand = new Random();

			randomValue = (lowerLimit) + rand.nextInt((upperLimit - lowerLimit) + 1);
byte[] bytes = ByteBuffer.allocate(4).putInt(randomValue).array();
			for(int j = 0; j < 4; j++) {
				outText += String.format("0x%X ", bytes[j]);
			}
                        outText +="\n";
			// outText +=  s1+" ";
//			byte[] bytes = ByteBuffer.allocate(4).putInt(randomValue).array();
//			for(int j = 0; j < 4; j++) {
//				outText += String.format("0x%X ", bytes[j]);
//			}

//			if (++i == count)
//				break;
//			else if (i % 1 == 0)
//				outText += "\n";
//			else
//				outText += " ";
		}
                         
                   }
                   else
                   {
                       
                        for ( i = 0; i < count;i++) {
			Random rand = new Random();
                        
                        byte[] bytes = ByteBuffer.allocate(4).putInt(rand.nextInt()).array();
			for(int j = 0; j < 4; j++) {
				outText += String.format("0x%X ", bytes[j]);
			}

			 outText +="\n";
                        }
                   }
                   
               }

		
		
		
		return outText;
	}

        
        

}
