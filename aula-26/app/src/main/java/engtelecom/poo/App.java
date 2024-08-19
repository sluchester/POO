/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String currentDir = System.getProperty("user.dir");

        boolean closeProgram = false;
        while(!closeProgram){
            System.out.print(currentDir+": ");
            String entrada = scanner.nextLine();
            String vet[] = entrada.split(" ");

            switch (vet[0]){
                case "ls":{
                    Path dir = Path.of(currentDir);
                    try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
                        for (Path path : stream) {
                            System.out.println(path.getFileName());
                        }
                    } catch (IOException e) {
                        System.err.println("Erro: " + e);
                    }
                    break;
                }
                case "stat":{
                    Path path = Path.of(currentDir + "/"+vet[1]);
                    if (Files.exists(path)) {
                        System.out.println(String.format("Arquivo: %s", path.toAbsolutePath()));
                        System.out.println(String.format("Regular: %s", Files.isRegularFile(path)));
                        System.out.println(String.format("Diretório: %s", Files.isDirectory(path)));
                        System.out.println(String.format("Permissão de leitura: %s", Files.isReadable(
                                path)));
                        System.out.println(String.format("Permissão de escrita: %s", Files.isWritable(
                                path)));
                    } else {
                        System.out.println("Arquivo não encontrado");
                    }
                    break;
                }

                case "touch":{
                    Path path = Path.of(currentDir + "/"+vet[1]);
                    try{
                        Files.createFile(path);
                        System.out.println("Arquivo criado");
                    } catch (Exception e) {
                        System.err.println("Erro: " + e);
                    }
                    break;
                }

                case "rm":{
                    Path path = Path.of(currentDir + "/"+vet[1]);
                    try{
                        Files.deleteIfExists(path);
                        System.out.println("Arquivo excluído");
                    } catch (Exception e) {
                        System.err.println("Erro: " + e);
                    }
                    break;
                }

                case "mv":{
                    Path path = Path.of(currentDir + "/"+vet[1]);
                    Path novoPath = Path.of(currentDir+"/"+vet[2]);
                    try{
                        Files.move(path, novoPath);
                        System.out.println("Arquivo movido");
                    } catch (Exception e) {
                        System.err.println("Erro: " + e);
                    }
                    break;
                }
                case "exit":{
                    closeProgram = true;
                }
            }
        }
    }
}
