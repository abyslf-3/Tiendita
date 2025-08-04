//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Arreglos de productos y precios
                String[] productos = {"Camisa", "Pantalón", "Zapatos", "Sombrero", "Chaqueta"};
                double[] precios = {150, 300, 250, 150, 300};
                int[] carrito = new int[productos.length]; // Cantidad de cada producto en el carrito

                int opcion;
                do {
                    System.out.println("\n--- MENÚ DE LA TIENDA ---");
                    System.out.println("1. Ver productos disponibles");
                    System.out.println("2. Agregar producto al carrito");
                    System.out.println("3. Ver total a pagar");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("\nProductos disponibles:");
                            for (int i = 0; i < productos.length; i++) {
                                System.out.println((i + 1) + ". " + productos[i] + " - Lps " + precios[i]);
                            }
                            break;

                        case 2:
                            System.out.print("\nIngrese el número del producto que desea agregar: ");
                            int seleccion = scanner.nextInt();
                            if (seleccion >= 1 && seleccion <= productos.length) {
                                carrito[seleccion - 1]++;
                                System.out.println(productos[seleccion - 1] + " agregado al carrito.");
                            } else {
                                System.out.println("Selección inválida.");
                            }
                            break;

                        case 3:
                            double total = 0;
                            System.out.println("\nCarrito de compras:");
                            for (int i = 0; i < productos.length; i++) {
                                if (carrito[i] > 0) {
                                    System.out.println(productos[i] + " x" + carrito[i] + " = $" + (carrito[i] * precios[i]));
                                    total += carrito[i] * precios[i];
                                }
                            }
                            System.out.printf("Total a pagar: Lps%.2f\n", total);
                            break;

                        case 4:
                            System.out.println("Gracias por visitar la Tiendita. ¡Hasta pronto!");
                            break;

                        default:
                            System.out.println("Opción inválida. Intente nuevamente.");
                    }

                } while (opcion != 4);

                scanner.close();
            }
