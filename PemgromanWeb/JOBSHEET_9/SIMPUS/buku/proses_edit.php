<?php
session_start();
require __DIR__ . '/../includes/koneksi.php';

$id        = $_POST['id'] ?? null;
$judul     = trim($_POST['judul'] ?? '');
$pengarang = trim($_POST['pengarang'] ?? '');
$tahun     = $_POST['tahun'] ?? '';
$stok      = $_POST['stok'] ?? '';

if (!$id) {
    header('Location: list.php');
    exit;
}

try {
    $stmt = $pdo->prepare(
        "UPDATE buku SET judul = :judul, pengarang = :pengarang, 
         tahun = :tahun, stok = :stok WHERE id = :id"
    );
    $stmt->execute([
        'judul'     => $judul,
        'pengarang' => $pengarang,
        'tahun'     => (int) $tahun,
        'stok'      => (int) $stok,
        'id'        => $id,
    ]);

    $_SESSION['flash'] = ['type' => 'success', 'pesan' => 'Data buku berhasil diperbarui.'];
    header('Location: list.php');
    exit;
} catch (PDOException $e) {
    $_SESSION['flash'] = ['type' => 'error', 'pesan' => 'Gagal memperbarui data: ' . $e->getMessage()];
    header('Location: edit.php?id=' . urlencode($id));
    exit;
}