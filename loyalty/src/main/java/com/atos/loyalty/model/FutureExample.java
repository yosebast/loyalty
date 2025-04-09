package com.atos.loyalty.model;

import java.util.concurrent.*;

public class FutureExample {
	public static void main(String[] args) {
		final ExecutorService executor = Executors.newSingleThreadExecutor();

		final Callable<String> task = () -> {
			TimeUnit.SECONDS.sleep(3);
			System.out.println("Tarea completada!...");
			return "Tarea completada!";
		};

		final Future<String> future = executor.submit(task);

		System.out.println("Tarea enviada...");

		try {
			System.out.println("Esperando el resultado...");
			// final String result = future.get(5, TimeUnit.SECONDS); // Esperar hasta 5
			// segundos
			// final String result = future.get();
			// System.out.println("Resultado: " + result);
			/*
			 * } catch (final InterruptedException e) {
			 * System.out.println("Tarea interrumpida."); } catch (final ExecutionException
			 * e) { System.out.println("Error al ejecutar la tarea: " + e.getMessage()); //
			 * } catch (final TimeoutException e) { //
			 * System.out.println("Tiempo de espera agotado."); // future.cancel(true); //
			 * Intentar cancelar la tarea
			 */
		} finally {
			System.out.println("llega a este puento");

			executor.shutdown();
		}

		System.out.println("finaliza el hilo principal");

	}
}
