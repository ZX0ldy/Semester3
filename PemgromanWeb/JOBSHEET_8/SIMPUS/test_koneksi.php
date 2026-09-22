<?php
// Memanggil file koneksi di folder includes
require __DIR__ . '/includes/koneksi.php';

if ($pdo) {
    echo "<div style='padding: 20px; background-color: #d4edda; color: #155724; border: 1px solid #c3e6cb; border-radius: 5px; font-family: sans-serif; margin: 20px;'>";
    echo "<h2>Koneksi Berhasil!</h2>";
    echo "<p>Aplikasi PHP berhasil terhubung ke database PostgreSQL (pgAdmin) pada database <strong>simpus_mini</strong>.</p>";
    echo "</div>";
}
?>