package com.atos.loyalty.model;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {
	public static void main(String[] args) {
		// 1. Crear un CompletableFuture usando supplyAsync
		final CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (final InterruptedException e) {
				Thread.currentThread().interrupt();
				return "Tarea interrumpida";
			}
			return "Resultado de la tarea asíncrona";
		}).thenApply(result -> {
			return "Resultado procesado: " + result;
		}).exceptionally(error -> {
			System.err.println("Ocurrió un error: " + error);
			return "Resultado por defecto en caso de error";
		});

		// 2. Imprimir un mensaje indicando que la tarea asíncrona ha sido iniciada
		System.out.println("Tarea asíncrona iniciada...");

		try {
			// 3. Esperar el resultado del CompletableFuture con un timeout
			final String finalResult = future.get(5, TimeUnit.SECONDS);
			System.out.println("Resultado final: " + finalResult);
		} catch (final Exception e) {
			// 4. Manejar cualquier excepción que ocurra al obtener el resultado
			e.printStackTrace();
		}
	}
}
