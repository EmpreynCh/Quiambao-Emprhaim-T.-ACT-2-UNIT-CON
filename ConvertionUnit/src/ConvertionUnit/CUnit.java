package ConvertionUnit;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CUnit extends JFrame implements ActionListener{
  
	JTextField IN =new JTextField();
	JTextField NAME =new JTextField();
	JTextField SECT =new JTextField();
	
	JComboBox CBox =new JComboBox();
	JComboBox C1 =new JComboBox();
	JComboBox C2 =new JComboBox();
	
	JLabel INL =new JLabel("From :");
	JPanel PANELOPT =new JPanel();
	JLabel OUT = new JLabel();
	
	JButton NEWBUTT= new JButton("New");
	
	JButton CONT= new JButton("Convert");
	
	 
	     
	CUnit(){
		 
		 Toolkit TK =this.getToolkit();
		 Dimension DN =   TK.getScreenSize();
		 
		 this.setSize(800,800);
		 this.setTitle("UNIT_CONVERSION");
		 this.setLocation(DN.width/2-this.getWidth()/2,DN.height/2-this.getHeight()/2);
		    
		 ImageIcon PICTURE = new ImageIcon(new ImageIcon("pow.png").getImage().getScaledInstance(800, 800, Image.SCALE_SMOOTH));
		 JLabel BGI = new JLabel("", PICTURE, JLabel.CENTER);
		 
		 ImageIcon image = new ImageIcon("Creeper.png");
		 this.setIconImage(image.getImage());
			
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 this.setResizable(false);
		 this.setVisible(false);
		 
		 //Select Unit To Convert
		 JLabel SELECTUNIT =new JLabel("SELECT UNIT OF CONVERT ");
		 JLabel UNITCON =new JLabel("SELECT UNIT OF CONVERTER ");
		 JLabel OUTPUTL =new JLabel("To :");
		 
		
		 NEWBUTT.setFont(new Font("Century Gothic", Font.BOLD, 16));
		 NEWBUTT.setForeground(Color.RED);
		 
		 CONT.setFont(new Font("Century Gothic", Font.BOLD, 16)); 
		 CONT.setForeground(Color.BLUE);
		 
		 BGI.setBounds(0, 0, 800, 800);
		 UNITCON.setBounds(250, 10, 300, 60);
		 UNITCON.setFont(new Font("Century Gothic", Font.BOLD, 20));
		 UNITCON.setForeground(Color.white);
		 
		 SELECTUNIT.setBounds(250, 190, 300, 60);
		 SELECTUNIT.setFont(new Font("Century Gothi'", Font.BOLD, 20));
		 SELECTUNIT.setForeground(Color.white);
		 CBox.setBounds(300, 80, 170, 30);
		 
		 CBox.setFocusable(false);
		 CBox.addItem("Length");
		 CBox.addItem("Temperature");
		 CBox.addItem("Time");
		 CBox.addItem("Weight"); 
		 INL.setBounds(500, 380, 140, 30); //textbutton
		 INL.setFont(new Font("Century Gothic'", Font.BOLD, 16));
		 INL.setForeground(Color.white);
		 IN.setBounds(120, 420, 180, 30);  // textbutton
		 
		 OUTPUTL.setBounds(200, 380, 140, 30);
		 OUTPUTL.setFont(new Font("Century Gothic'", Font.BOLD, 16));
		 OUTPUTL.setForeground(Color.white);
		 PANELOPT.setBounds(450, 420,  180, 30);
		 PANELOPT.setBackground(Color.WHITE);
		 PANELOPT.setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
	     OUT.setBounds(460, 420, 180, 30);
		 OUT.setForeground(Color.BLACK);
		 
		    C1.setBounds(120, 270, 180, 30);
		    C1.setFocusable(false);
		    C2.setBounds(450, 270, 180, 30);
		    C2.setFocusable(false);
		    CONT.setBounds(120, 500, 180, 30);
		    CONT.setFocusable(false);
		    NEWBUTT.setBounds(450, 500, 180, 30);
		    NEWBUTT.setFocusable(false);
		 
		    this.add(NEWBUTT);this.add(CONT);this.add(UNITCON); this.add(SELECTUNIT);
		    this.add(IN);this.add(INL);this.add(OUTPUTL);this.add(CBox);this.add(C1);
		    this.add(C2);this.add(OUT);this.add(PANELOPT);this.add(BGI);this.setLayout(null);
		    this.setVisible(true);CBox.addActionListener(this);NEWBUTT.addActionListener(this);
		    CONT.addActionListener(this);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String selectedInput = (String) CBox.getSelectedItem();
		 String inputUnit = (String) C1.getSelectedItem();
       String outputUnit = (String) C2.getSelectedItem();

		 if (e.getSource()==CBox) {
	
		 
		 C1.removeAllItems();
		 C2.removeAllItems();

		 if (selectedInput.equals("Length")) {
				C1.addItem("Millimeter");
				C1.addItem("Centimeter");
				C1.addItem("Meter");
				C1.addItem("Kilometer");
				C1.addItem("Mile(s)");
				C1.addItem("Yard");
				C1.addItem("Foot");
				C1.addItem("Inch(s)");
				
				
				C2.addItem("Millimeter");
				C2.addItem("Centimeter");
				C2.addItem("Meter");
				C2.addItem("Kilometer");
				C2.addItem("Mile(s)");
				C2.addItem("Yard");
				C2.addItem("Foot");
				C2.addItem("Inch(s)");
				
				
				System.out.println(C1.getSelectedIndex());
				System.out.println(C2.getSelectedIndex());
				
	        }
		 else if (selectedInput.equals("Weight")){
	        	
	        	C1.addItem("Gram(s)");
				C1.addItem("Kilogram(s)");
				C1.addItem("Pound(s)");
				C1.addItem("Ounce(s)");
				
				C2.addItem("Miligram(s)");
				C2.addItem("Gram(s)");
				C2.addItem("Kilogram(s)");
				C2.addItem("Pound(s)");
				C2.addItem("Ounce(s)");
				
	        }
	        else if(selectedInput.equals("Temperature")) {
	        	C1.addItem("Celsius");
				C1.addItem("Fahrenheit");
				C1.addItem("Kelvin");
				
				C2.addItem("Celsius");
				C2.addItem("Fahrenheit");
				C2.addItem("Kelvin");
				
					
		       }
	        else if (selectedInput.equals("Time")) {
		    	   
		    	    C1.addItem("Milisecond(s)");
					C1.addItem("Second(s)");
					C1.addItem("Minute(s)");
					C1.addItem("Hour(s)");
					C1.addItem("Day(s)");
					C1.addItem("Week(s)");
					C1.addItem("Month(s)");
					C1.addItem("Year(s)");
					
					
					C2.addItem("Milisecond(s)");
					C2.addItem("Second(s)");
					C2.addItem("Minute(s)");
					C2.addItem("Hour(s)");
					C2.addItem("Day(s)");
					C2.addItem("Week(s)");
					C2.addItem("Month(s)");
					C2.addItem("Year(s)");
						
	        }
		    	   
		       }
		 	
		 
		 	if (e.getSource()==NEWBUTT){OUT.setText("");IN.setText("");C1.removeAllItems();C2.removeAllItems();
		 		
		 	}
		 	
	
		 
		 	
			if(e.getSource()==CONT){
				String in= IN.getText();
				if (!isNumeric(in)) {
					JOptionPane.showMessageDialog(this, "Please Enter a valid number ","title",JOptionPane.ERROR_MESSAGE);
					return;
				}
		 	
				double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
				  
		            if (inputUnit.equals("Meter")) {
		            	
		                if (outputUnit.equals("Centimeter")) {
		                	
		                    outputValue = inputValue * 100.0;
		                    OUT.setText(String.format("%.8f", outputValue));
		                } 
		                else if (outputUnit.equals("Meter")) {
		                	 outputValue = inputValue;
		                	 OUT.setText(String.format("%.0f", outputValue));	
		                }
		                
		                else if (outputUnit.equals("Inch(s)")) {
		                	
		                    outputValue = inputValue * 39.3700787;
		                    OUT.setText(String.format("%.8f", outputValue));
		                    
		                }
		                else if (outputUnit.equals("Millimeter")) {
		                	 outputValue = inputValue * 1000;
		                	 OUT.setText(String.format("%.8f", outputValue));
		                }
		                else if (outputUnit.equals("Kilometer")) {
		                	 outputValue = inputValue * 0.001;
		                	 OUT.setText(String.format("%.8f", outputValue));
		                }
		                else if (outputUnit.equals("Mile(s)")) {
		                	 outputValue = inputValue * 0.0006214;
		                	 OUT.setText(String.format("%.8f", outputValue));
		                }
		                else if (outputUnit.equals("Yard")) {
		                	 outputValue = inputValue * 1.0936133;
		                	 OUT.setText(String.format("%.8f", outputValue));
			                    
		                } else if (outputUnit.equals("Foot")) {
		                	 outputValue = inputValue * 3.2808399;
		                	 OUT.setText(String.format("%.8f", outputValue));
		                }
		            }
			}
			 ///Centimeter COMPUTATION
			 if (e.getSource() == CONT){
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0;

		    	   if (inputUnit.equals("Centimeter")) {
		    		   if (outputUnit.equals("Centimeter")) {
		                	
		                    outputValue = inputValue;
		                    OUT.setText(String.format("%.0f", outputValue));	
		                } 
		            	
		                if (outputUnit.equals("Meter")) {
		                	
		                    outputValue = inputValue * 0.01;
		                    OUT.setText(String.format("%.8f", outputValue));
		                } 
		                
		                else if (outputUnit.equals("Inch(s)")) {
		                	
		                    outputValue = inputValue * 0.393700787;
		                    OUT.setText(String.format("%.8f", outputValue));
		                    
		                }
		                else if (outputUnit.equals("Millimeter")) {
		                	 outputValue = inputValue * 10;
		                	 OUT.setText(String.format("%.8f", outputValue));
		                }
		                else if (outputUnit.equals("Kilometer")) {
		                	 outputValue = inputValue * 0.00001;
		                	 OUT.setText(String.format("%.8f", outputValue));
		                }
		                else if (outputUnit.equals("Mile(s)")) {
		                	 outputValue = inputValue * 0.0006214;
		                	 OUT.setText(String.format("%.8"
			                    		+ "f", outputValue));
		                }
		                else if (outputUnit.equals("Yard)")) {
		                	 outputValue = inputValue * 1.0936133;
		                	 OUT.setText(String.format("%.8f", outputValue));
			                    
		                } else if (outputUnit.equals("Foot")) {
		                	 outputValue = inputValue * 0.032808399;
		                	 OUT.setText(String.format("%.8f", outputValue));
		                }
		                
		                
		                }
			 	}
			 ///Millimeter COMPUTATION
			 if (e.getSource() == CONT){
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0;
			 
			 if (inputUnit.equals("Millimeter")) {
	                if (outputUnit.equals("Centimeter")) {
	                    outputValue = inputValue / 10.0;
	                    OUT.setText(String.format("%.8f", outputValue));
	                }
	                else if (outputUnit.equals("Millimeter")) {
	                    outputValue = inputValue ;
	                    OUT.setText(String.format("%.0f", outputValue));	
               }
	                else if (outputUnit.equals("Meter")) {
	                    outputValue = inputValue *0.001;
	                    OUT.setText(String.format("%.8f", outputValue));
	                }
	                else if (outputUnit.equals("Kilometer")) {
	                    outputValue = inputValue * 0.000001;
	                    OUT.setText(String.format("%.8f", outputValue));

	                } 
	                else if (outputUnit.equals("Inch(s) ")) {
	                    outputValue = inputValue * 0.393700787;
	                    OUT.setText(String.format("%.8f", outputValue));

	                } 
	                else if (outputUnit.equals("Foot")) {
	                	 outputValue = inputValue * 3.2808399;
	                	 OUT.setText(String.format("%.8f", outputValue));
	                } 
	                else if (outputUnit.equals("Yard")) {
	                	 outputValue = inputValue * 1.0936133;
	                	 OUT.setText(String.format("%.8f", outputValue));
	                }
	                else if (outputUnit.equals("Mile(s)")) {
	                	outputValue = inputValue * 0.0006214;
	                	OUT.setText(String.format("%.8f", outputValue));
	                } 
			 
			 
			 }
			 }
			 //KILOMETER
			 if (e.getSource() == CONT){
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0;
			 
			 if (inputUnit.equals("Kilometer")) {
	                if (outputUnit.equals("Centimeter")) {
	                    outputValue = inputValue / 100000;
	                    OUT.setText(String.format("%.0f", outputValue));	
	                }
	                else if (outputUnit.equals("Kilometer")) {
	                    outputValue = inputValue ;
	                    OUT.setText(String.format("%.8f", outputValue));
               }
	                else if (outputUnit.equals("Meter")) {
	                    outputValue = inputValue *1000;
	                    OUT.setText(String.format("%.8f", outputValue));
	                }
	                else if (outputUnit.equals("Millimeter ")) {
	                    outputValue = inputValue * 1000000;
	                    OUT.setText(String.format("%.8f", outputValue));

	                } 
	                else if (outputUnit.equals("Inch(s)")) {
	                    outputValue = inputValue * 39370.0787;
	                    OUT.setText(String.format("%.8f", outputValue));

	                } 
	                else if (outputUnit.equals("Foot")) {
	                	 outputValue = inputValue * 3280.8399;
	                	 OUT.setText(String.format("%.8f", outputValue));
	                } 
	                else if (outputUnit.equals("Yard")) {
	                	 outputValue = inputValue * 1093.6133;
	                	 OUT.setText(String.format("%.8f", outputValue));
	                }
	                else if (outputUnit.equals("Mile(s)")) {
	                	outputValue = inputValue * 0.6214;
	                	OUT.setText(String.format("%.8f", outputValue));
	                } 
			 
			 
			 }
			 }
			 //MILE
			 if (e.getSource() == CONT){
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0;
			 
			 if (inputUnit.equals("Mile(s)")) {
	                if (outputUnit.equals("Centimeter")) {
	                    outputValue = inputValue * 160926.9391696169939;
	                    OUT.setText(String.format("%.8f", outputValue));
	                }
	                else if (outputUnit.equals("Mile(s)")) {
	                    outputValue = inputValue ;
	                    OUT.setText(String.format("%.0f", outputValue));	
               }
	                else if (outputUnit.equals("Meter")) {
	                    outputValue = inputValue *1609.269391696169939;
	                    OUT.setText(String.format("%.8f", outputValue));
	                }
	                else if (outputUnit.equals("Millimeter")) {
	                    outputValue = inputValue * 1609269.391696169939;
	                    OUT.setText(String.format("%.8f", outputValue));

	                } 
	                else if (outputUnit.equals("Inch(s)")) {
	                    outputValue = inputValue * 63360;
	                    OUT.setText(String.format("%.8f", outputValue));

	                } 
	                else if (outputUnit.equals("Foot")) {
	                	 outputValue = inputValue * 5280;
	                	 OUT.setText(String.format("%.8f", outputValue));
	                } 
	                else if (outputUnit.equals("Yard")) {
	                	 outputValue = inputValue * 1760;
	                	 OUT.setText(String.format("%.8f", outputValue));
	                }
	                else if (outputUnit.equals("Kilometer")) {
	                	outputValue = inputValue *1.60934;
	                	OUT.setText(String.format("%.8f", outputValue));
	                } 
			 
			 
			 }
			 }
			 //YARD
			 if(e.getSource()==CONT){
			 		
				 	
					double inputValue = Double.parseDouble(IN.getText());
			         double outputValue = 0.0;
					  
			            if (inputUnit.equals("Yard")) {
			            	
			                if (outputUnit.equals("Centimeter")) {
			                	
			                    outputValue = inputValue * 91.44;
			                    OUT.setText(String.format("%.8f", outputValue));
			                } 
			                else if (outputUnit.equals("Yard")) {
			                	 outputValue = inputValue;
			                	 OUT.setText(String.format("%.0f", outputValue));	
			                }
			                
			                else if (outputUnit.equals("Inch(s)")) {
			                	
			                    outputValue = inputValue * 36;
			                    OUT.setText(String.format("%.8f", outputValue));
			                    
			                }
			                else if (outputUnit.equals("Millimeter")) {
			                	 outputValue = inputValue * 914.4;
			                	 OUT.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Kilometer")) {
			                	 outputValue = inputValue * 0.000914;
			                	 OUT.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Mile(s)")) {
			                	 outputValue = inputValue * 0.000568;
			                	 OUT.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Meter")) {
			                	 outputValue = inputValue * 0.9144;
			                	 OUT.setText(String.format("%.8f", outputValue));
				                    
			                } else if (outputUnit.equals("Foot")) {
			                	 outputValue = inputValue * 3;
			                	 OUT.setText(String.format("%.8f", outputValue));
			                }
			            }
			 
			 }
			 //FOOT
			 if(e.getSource()==CONT){
			 		
				 	
					double inputValue = Double.parseDouble(IN.getText());
			         double outputValue = 0.0;
					  
			            if (inputUnit.equals("Foot")) {
			            	
			                if (outputUnit.equals("Centimeter")) {
			                	
			                    outputValue = inputValue *30.48;
			                    OUT.setText(String.format("%.8f", outputValue));
			                } 
			                else if (outputUnit.equals("Foot")) {
			                	 outputValue = inputValue;
			                	 OUT.setText(String.format("%.0f", outputValue));	
			                }
			                
			                else if (outputUnit.equals("Inch(s)")) {
			                	
			                    outputValue = inputValue * 12;
			                    OUT.setText(String.format("%.8f", outputValue));
			                    
			                }
			                else if (outputUnit.equals("Millimeter")) {
			                	 outputValue = inputValue *304.8;
			                	 OUT.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Kilometer")) {
			                	 outputValue = inputValue * 0.0003048;
			                	 OUT.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Mile(s)")) {
			                	 outputValue = inputValue * 0.000189394;
			                	 OUT.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Meter")) {
			                	 outputValue = inputValue * 0.3048;
			                	 OUT.setText(String.format("%.8f", outputValue));
				                    
			                } else if (outputUnit.equals("Yard")) {
			                	 outputValue = inputValue * 0.333333;
			                	 OUT.setText(String.format("%.8f", outputValue));
			                }
			            }
			 
			 }
			 //INCH
			 if(e.getSource()==CONT){
			 		
				 	
					double inputValue = Double.parseDouble(IN.getText());
			         double outputValue = 0.0;
					  
			            if (inputUnit.equals("Inch(s)")) {
			            	
			                if (outputUnit.equals("Centimeter")) {
			                	
			                    outputValue = inputValue * 2.54;
			                    OUT.setText(String.format("%.8f", outputValue));
			                } 
			                else if (outputUnit.equals("Inch(s)")) {
			                	 outputValue = inputValue;
			                	 OUT.setText(String.format("%.0f", outputValue));	
			                }
			                
			                else if (outputUnit.equals("Yard")) {
			                	
			                    outputValue = inputValue * 0.027778;
			                    OUT.setText(String.format("%.8f", outputValue));
			                    
			                }
			                else if (outputUnit.equals("Millimeter")) {
			                	 outputValue = inputValue *25.4;
			                	 OUT.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Kilometer")) {
			                	 outputValue = inputValue *0.000025;
			                	 OUT.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Mile(s)")) {
			                	 outputValue = inputValue * 0.000016;
			                	 OUT.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Meter")) {
			                	 outputValue = inputValue * 0.0254;
			                	 OUT.setText(String.format("%.8f", outputValue));
				                    
			                } else if (outputUnit.equals("Foot")) {
			                	 outputValue = inputValue * 0.0833333;
			                	 OUT.setText(String.format("%.8f", outputValue));
			                }
			            }
			 
			 }
			 //WEIGHT
			 //Miligram(s)
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
		         if (inputUnit.equals("Miligram(s)")) {	
		        	if (outputUnit.equals("Miligram(s)")) {
		                   outputValue = inputValue ;
		                   OUT.setText(String.format("%.0f", outputValue));	
		                
		        	 }
		        	else if (outputUnit.equals("Gram(s)")) {
		                   outputValue = inputValue * 0.001;
		                   OUT.setText(String.format("%.8f", outputValue));
		                
		        	 }
		         
		         else if (outputUnit.equals("Kilogram(s)")) {
	                   outputValue = inputValue * 0.000001;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
	        	 }
		         else if (outputUnit.equals("Pound(s)")) {
	                   outputValue = inputValue * 0.000002;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
		         }
		         else if (outputUnit.equals("Ounce(s)")) {
	                   outputValue = inputValue *0.000035;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
		         }
				 
				 
				 
			 }
			 }
			 //Gram(s)
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
		         if (inputUnit.equals("Gram(s)")) {	
		        	if (outputUnit.equals("Gram(s)")) {
		                   outputValue = inputValue ;
		                   OUT.setText(String.format("%.0f", outputValue));	
		                
		        	 }
		        	else if (outputUnit.equals("Miligram(s)")) {
		                   outputValue = inputValue * 1000;
		                   OUT.setText(String.format("%.8f", outputValue));
		                
		        	 }
		         
		         else if (outputUnit.equals("Kilogram(s)")) {
	                   outputValue = inputValue *0.001;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
	        	 }
		         else if (outputUnit.equals("Pound(s)")) {
	                   outputValue = inputValue *0.002205;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
		         }
		         else if (outputUnit.equals("Ounce(s)")) {
	                   outputValue = inputValue* 0.035274;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
		         }
				 
				 
				 
			 }
			 }
			 //Kilogram(s)
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
		         if (inputUnit.equals("Kilogram(s)")) {	
		        	if (outputUnit.equals("Kilogram(s)")) {
		                   outputValue = inputValue ;
		                   OUT.setText(String.format("%.0f", outputValue));	
		                
		        	 }
		        	else if (outputUnit.equals("Miligram(s)")) {
		                   outputValue = inputValue * 1000000;
		                   OUT.setText(String.format("%.8f", outputValue));
		                
		        	 }
		         
		         else if (outputUnit.equals("Gram(s)")) {
	                   outputValue = inputValue *1000;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
	        	 }
		         else if (outputUnit.equals("Pound(s)")) {
	                   outputValue = inputValue *2.204623;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
		         }
		         else if (outputUnit.equals("Ounce(s)")) {
	                   outputValue = inputValue*35.27396;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
		         }
		        	}
		         }
			 //Pound(s)
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
		         if (inputUnit.equals("Pound(s)")) {	
		        	if (outputUnit.equals("Pound(s)")) {
		                   outputValue = inputValue ;
		                   OUT.setText(String.format("%.0f", outputValue));	
		                
		        	 }
		        	else if (outputUnit.equals("Miligram(s)")) {
		                   outputValue = inputValue * 453592.4;
		                   OUT.setText(String.format("%.8f", outputValue));
		                
		        	 }
		         
		         else if (outputUnit.equals("Gram(s)")) {
	                   outputValue = inputValue *453.5924;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
	        	 }
		         else if (outputUnit.equals("Kilogram(s)")) {
	                   outputValue = inputValue *0.453592;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
		         }
		         else if (outputUnit.equals("Ounce(s)")) {
	                   outputValue = inputValue*16;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
		         }
		        	}
		         }
			//Pound(s)
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
		         if (inputUnit.equals("Ounce(s)")) {	
		        	if (outputUnit.equals("Ounce(s)")) {
		                   outputValue = inputValue ;
		                   OUT.setText(String.format("%.0f", outputValue));	
		                
		        	 }
		        	else if (outputUnit.equals("Miligram(s)")) {
		                   outputValue = inputValue * 28349.52;
		                   OUT.setText(String.format("%.8f", outputValue));
		                
		        	 }
		         
		         else if (outputUnit.equals("Gram(s)")) {
	                   outputValue = inputValue *28.34952;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
	        	 }
		         else if (outputUnit.equals("Kilogram(s)")) {
	                   outputValue = inputValue *0.02835;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
		         }
		         else if (outputUnit.equals("Pound(s)")) {
	                   outputValue = inputValue*0.0625;
	                   OUT.setText(String.format("%.8f", outputValue));
	                
		         }
		        	}
		         }
			 //Temperature
			 //Celsius
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
				  if (inputUnit.equals("Celsius")) {
					  if (outputUnit.equals("Celsius")) {
						  outputValue = inputValue ;
						  OUT.setText(String.format("%.0f", outputValue));	
					  
					  }
					  else if (outputUnit.equals("Fahrenheit")) {
		                   outputValue = (inputValue*9/5) + 32 ;

		                   OUT.setText(String.format("%.8f", outputValue));
		                
			         }
		                  
					  else if (outputUnit.equals("Kelvin")) {
		                   outputValue = inputValue + 273.15;
		                   OUT.setText(String.format("%.8f", outputValue));						  
				  }
			        	
			  }	 
				 
			 }
			 //Fahrenheit
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
				  if (inputUnit.equals("Fahrenheit")) {
					  if (outputUnit.equals("Fahrenheit")) {
						  outputValue = inputValue ;
						  OUT.setText(String.format("%.0f", outputValue));	
					  
					  }
					  else if (outputUnit.equals("Celsius")) {
		                   outputValue = (inputValue - 32) * 5/9 ;

		                   OUT.setText(String.format("%.8f", outputValue));
		                
			         }
		                  
					  else if (outputUnit.equals("Kelvin")) {
		                   outputValue = (inputValue-32) * 5/9 + 273.15;
		                   OUT.setText(String.format("%.8f", outputValue));						  
				  }
			        	
			  }	 
				 
			 }
			//Kelvin
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
				  if (inputUnit.equals("Kelvin")) {
					  if (outputUnit.equals("Kelvin")) {
						  outputValue = inputValue ;
						  OUT.setText(String.format("%.0f", outputValue));	
					  
					  }
					  else if (outputUnit.equals("Celsius")) {
		                   outputValue = inputValue - 273.15  ;

		                   OUT.setText(String.format("%.8f", outputValue));
		                
			         }
		                  
					  else if (outputUnit.equals("Fahrenheit")) {
		                   outputValue = (inputValue-273.15) * 9/5 + 32;
		                   OUT.setText(String.format("%.8f", outputValue));						  
				  }
			        	
			  }	 
				 
			 }
			 //TIME
			 //SEconds
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
			  if (inputUnit.equals("Second(s)")) {
	                if (outputUnit.equals("Second(s)")) {
	                    outputValue = inputValue;
	                    OUT.setText(String.format("%.0f", outputValue));					  
					  
	                } 
	                else if (outputUnit.equals("Milisecond(s)")) {
	                    outputValue = inputValue / 1000;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	                else if (outputUnit.equals("Minute(s)")) {
	                    outputValue = inputValue /60;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Hour(s)")) {
	                    outputValue = inputValue / 3600.0;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Day(s)")) {
	                    outputValue = inputValue / 86400.0;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Week(s)")) {
	                    outputValue = inputValue / 604800.0;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Month(s)")) {
	                    outputValue = inputValue / 2.628e+6;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Year(s)")) {
	                    outputValue = inputValue / 3.154+7;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	            }
			  }
			//TIME
			 //Milisecond(s)
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
			  if (inputUnit.equals("Milisecond(s)")) {
	                if (outputUnit.equals("Milisecond(s)")) {
	                    outputValue = inputValue;
	                    OUT.setText(String.format("%.0f", outputValue));						  
					  
	                } 
	                else if (outputUnit.equals("Second(s)")) {
	                    outputValue = inputValue / 1000;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	                else if (outputUnit.equals("Minute(s)")) {
	                    outputValue = inputValue /60000;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Hour(s)")) {
	                    outputValue = inputValue /  3.6e+6;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Day(s)")) {
	                    outputValue = inputValue / 8.64e+7
;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Week(s)")) {
	                    outputValue = inputValue / 6.048e+8;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Month(s)")) {
	                    outputValue = inputValue /2.628e+9;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Year(s)")) {
	                    outputValue = inputValue / 3.154e+10;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	            }
			  }
			//Minute(s)
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
			  if (inputUnit.equals("Minute(s)")) {
	                if (outputUnit.equals("Minute(s)")) {
	                    outputValue = inputValue;
	                    OUT.setText(String.format("%.0f", outputValue));						  
					  
	                } 
	                else if (outputUnit.equals("Second(s)")) {
	                    outputValue = inputValue / 60;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	                else if (outputUnit.equals("Milisecond(s)")) {
	                    outputValue = inputValue / 60000;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Hour(s)")) {
	                    outputValue = inputValue /  60;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Day(s)")) {
	                    outputValue = inputValue / 1440;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Week(s)")) {
	                    outputValue = inputValue / 10080;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Month(s)")) {
	                    outputValue = inputValue /43800;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Year(s)")) {
	                    outputValue = inputValue / 525600;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	            }
			  }
				//Hour(s)
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
			  if (inputUnit.equals("Hour(s)")) {
	                if (outputUnit.equals("Hour(s)")) {
	                    outputValue = inputValue;
	                    OUT.setText(String.format("%.0f", outputValue));						  
					  
	                } 
	                else if (outputUnit.equals("Second(s)")) {
	                    outputValue = inputValue / 3600;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	                else if (outputUnit.equals("Milisecond(s)")) {
	                    outputValue = inputValue / 3.6e+6;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Minute(s)")) {
	                    outputValue = inputValue /  60;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Day(s)")) {
	                    outputValue = inputValue / 24;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Week(s)")) {
	                    outputValue = inputValue / 168;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Month(s)")) {
	                    outputValue = inputValue /730;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Year(s)")) {
	                    outputValue = inputValue / 8760;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	            }
			  }
			//Day(s)
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
			  if (inputUnit.equals("Day(s)")) {
	                if (outputUnit.equals("Day(s)")) {
	                    outputValue = inputValue;
	                    OUT.setText(String.format("%.0f", outputValue));						  
					  
	                } 
	                else if (outputUnit.equals("Second(s)")) {
	                    outputValue = inputValue *86400;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	                else if (outputUnit.equals("Milisecond(s)")) {
	                    outputValue = inputValue * 8.64e+7;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Minute(s)")) {
	                    outputValue = inputValue *1440;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Hour(s)")) {
	                    outputValue = inputValue * 24;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Week(s)")) {
	                    outputValue = inputValue / 7;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Month(s)")) {
	                    outputValue = inputValue / 30.417;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Year(s)")) {
	                    outputValue = inputValue / 365;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	            }
			  }
				//week
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
			  if (inputUnit.equals("Week(s)")) {
	                if (outputUnit.equals("Week(s)")) {
	                    outputValue = inputValue;
	                    OUT.setText(String.format("%.0f", outputValue));						  
					  
	                } 
	                else if (outputUnit.equals("Second(s)")) {
	                    outputValue = inputValue * 604800;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	                else if (outputUnit.equals("Milisecond(s)")) {
	                    outputValue = inputValue * 6.048e+8;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Minute(s)")) {
	                    outputValue = inputValue *10080;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Hour(s)")) {
	                    outputValue = inputValue * 168;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Day(s)")) {
	                    outputValue = inputValue / 7;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Month(s)")) {
	                    outputValue = inputValue /4.345;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Year(s)")) {
	                    outputValue = inputValue / 52.143;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	            }
			  }
				//MONTH
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
			  if (inputUnit.equals("Month(s)")) {
	                if (outputUnit.equals("Month(s)")) {
	                    outputValue = inputValue;
                    OUT.setText(String.format("%.0f", outputValue));						  
					  
	                } 
	                else if (outputUnit.equals("Second(s)")) {
	                    outputValue = inputValue *  2.628e+6;
                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	                else if (outputUnit.equals("Milisecond(s)")) {
	                    outputValue = inputValue *2.628e+9;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Minute(s)")) {
	                    outputValue = inputValue *43800;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Hour(s)")) {
	                    outputValue = inputValue * 730;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Day(s)")) {
	                    outputValue = inputValue *30.417;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Week(s)")) {
	                    outputValue = inputValue *4.345;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Year(s)")) {
	                    outputValue = inputValue / 12;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	            }
			  }
				//MONTH
			 if (e.getSource()==CONT) {
				 double inputValue = Double.parseDouble(IN.getText());
		         double outputValue = 0.0;
			  if (inputUnit.equals("Year(s)")) {
	                if (outputUnit.equals("Year(s)")) {
	                    outputValue = inputValue;
	                    OUT.setText(String.format("%.0f", outputValue));						  
					  
	                } 
	                else if (outputUnit.equals("Second(s)")) {
	                    outputValue = inputValue *  3.154e+7;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	                else if (outputUnit.equals("Milisecond(s)")) {
	                    outputValue = inputValue * 3.154e+10;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Minute(s)")) {
	                    outputValue = inputValue *525600;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Hour(s)")) {
	                    outputValue = inputValue * 8760;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Day(s)")) {
	                    outputValue = inputValue *365;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Week(s)")) {
	                    outputValue = inputValue * 52.143;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                else if (outputUnit.equals("Month(s)")) {
	                    outputValue = inputValue * 12;
	                    OUT.setText(String.format("%.8f", outputValue));		
	                } 
	                
	            }
			 }
			  }
			 private boolean isNumeric(String str) {
					try {
						double d=Double.parseDouble(str);
					}catch (NumberFormatException d) {
					return false;
				}
			 return true;
		 	}

	
		 	
	}
			
		 
		 	
		 	
