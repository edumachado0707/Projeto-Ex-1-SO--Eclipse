package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessosController {

	public ProcessosController() {
		super();
	}

	//Retorne o S.O. que está em execução na máquina
	public RedesController() {
	 	super();
	}
		
	
	 public void ip(String os) {
		Process process;
		try {
			boolean windows = false;
			if (os.contains("Linux")) {
				process = Runtime.getRuntime().exec("ifconfig");
			}else {
				process = Runtime.getRuntime().exec("ipconfig");
				windows = true;
			}
InputStream fluxo = process.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String line = buffer.readLine();
			String adaptador = null;

			while (line != null) {
				if(windows) {
					if(line.contains("Adaptador"))
						adaptador = line.replace("Adaptador","").replace(":", "");
					else if(adaptador !=null && line.contains("IPv4"))
					System.out.println("Adaptador:" + adaptador + "\n\t" + line);
				}else {
					if(line.contains("inet"))
					
  		                           System.out.println(linha);
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		public void ping(String os) {
		Process process;
		try {
			boolean windows = false;
			if (os.contains("Linux")) {
				process = Runtime.getRuntime().exec("ping -c 10 www.google.com.br");
			}else {
				process = Runtime.getRuntime().exec("PING -n 10 www.google.com.br");
				windows = true;
			}
			InputStream fluxo = process.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String line = buffer.readLine();
			String mensagens = "";
			while (line != null) {
					mensagens+=line;
					line = buffer.readLine();
			}
			if (windows) {
				System.out.println("A média final de tempo é: "+mensagens.substring(mensagens.length()-9));
			}else {
				line = buffer.readLine();
				System.out.println("A média final de tempo é: "+mensagens.substring(mensagens.length()-9));
			}
			fluxo.close();
			buffer.close();
			leitor.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
			
		
		
			
			
			
			
			
			
		
		