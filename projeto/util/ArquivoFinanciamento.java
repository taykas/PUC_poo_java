package projeto.util;

import projeto.modelo.*;

import java.io.*;
import java.util.ArrayList;

public class ArquivoFinanciamento {

    public static void salvarTexto(ArrayList<Financiamento> lista) {

        PrintWriter out = null;

        try {

            out = new PrintWriter(new FileWriter("financiamentos.txt"));

            for (Financiamento f : lista) {

                String linha =
                        f.getValorImovel() + ";" +
                        f.calcularTotalPagamento() + ";" +
                        f.getTaxaJurosAnual() + ";" +
                        f.getPrazoFinanciamento();

                if (f instanceof Casa) {

                    Casa c = (Casa) f;

                    linha += ";" +
                            c.getAreaConstruida() +
                            ";" +
                            c.getTamanhoTerreno();

                }

                else if (f instanceof Apartamento) {

                    Apartamento a = (Apartamento) f;

                    linha += ";" +
                            a.getVagasGaragem() +
                            ";" +
                            a.getNumeroAndar();

                }

                else if (f instanceof Terreno) {

                    Terreno t = (Terreno) f;

                    linha += ";" +
                            t.getTipoZona();

                }

                out.println(linha);

            }

        }

        catch(IOException e){

            e.printStackTrace();

        }

        finally{

            if(out!=null){

                out.close();

            }

        }

    }

    public static void lerTexto(){

        BufferedReader in = null;

        try{

            in = new BufferedReader(new FileReader("financiamentos.txt"));

            String linha;

            System.out.println("\n===== ARQUIVO TEXTO =====\n");

            while((linha = in.readLine()) != null){

                System.out.println(linha);

            }

        }

        catch(IOException e){

            e.printStackTrace();

        }

        finally{

            try{

                if(in!=null)

                    in.close();

            }

            catch(IOException e){

                e.printStackTrace();

            }

        }

    }

    public static void salvarFinanciamentos(ArrayList<Financiamento> lista){

        ObjectOutputStream out = null;

        try{

            out = new ObjectOutputStream(new FileOutputStream("financiamentos.dat"));

            for(Financiamento f : lista){

                out.writeObject(f);

            }

            out.flush();

        }

        catch(IOException e){

            e.printStackTrace();

        }

        finally{

            try{

                if(out!=null)

                    out.close();

            }

            catch(IOException e){

                e.printStackTrace();

            }

        }

    }

    public static ArrayList<Financiamento> recuperarFinanciamentos(){

        ArrayList<Financiamento> lista = new ArrayList<>();

        ObjectInputStream in = null;

        try{

            in = new ObjectInputStream(new FileInputStream("financiamentos.dat"));

            Object obj;

            while((obj = in.readObject()) != null){

                if(obj instanceof Financiamento){

                    lista.add((Financiamento)obj);

                }

            }

        }

        catch(EOFException e){

            System.out.println("Fim do arquivo.");

        }

        catch(ClassNotFoundException e){

            e.printStackTrace();

        }

        catch(IOException e){

            e.printStackTrace();

        }

        finally{

            try{

                if(in!=null)

                    in.close();

            }

            catch(IOException e){

                e.printStackTrace();

            }

        }

        return lista;

    }

}