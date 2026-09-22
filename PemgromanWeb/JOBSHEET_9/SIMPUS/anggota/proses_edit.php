<?php
session_start();
require __DIR__ . '/../includes/Koneksi.php';

$id         = $_POST['id'] ?? null;
$nama       = trim($_POST['nama'] ?? '');
$no_anggota = trim($_POST['no_anggota'] ?? '');
$alamat     = trim($_POST['alamat'] ?? '');
$no_hp      = trim($_POST['no_hp'] ?? '');

if (!$id) {
    header('Location: list.php');
    exit;
}

$errors = [];
if ($nama === '') $errors[] = "Nama wajib diisi.";
if ($no_anggota === '') $errors[] = "No. Anggota wajib diisi.";

if (!empty($errors)) {
    $_SESSION['flash'] = ['type' => 'error', 'pesan' => implode(' ', $errors)];
    header('Location: edit.php?id=' . urlencode($id));
    exit;
}

try {
    $stmt = $pdo->prepare(
        "UPDATE anggota SET nama = :nama, no_anggota = :no_anggota, 
         alamat = :alamat, no_hp = :no_hp WHERE id = :id"
    );
    $stmt->execute([
        'nama'       => $nama,
        'no_anggota' => $no_anggota,
        'alamat'     => $alamat,
        'no_hp'      => $no_hp,
        'id'         => $id,
    ]);

    $_SESSION['flash'] = ['type' => 'success', 'pesan' => 'Data anggota berhasil diperbarui.'];
    header('Location: list.php');
    exit;
} catch (PDOException $e) {
    // Menangkap error jika No. Anggota yang diubah bentrok dengan anggota lain (UNIQUE Constraint)
    $pesan = (strpos($e->getMessage(), 'unique constraint') !== false) 
        ? 'No. Anggota sudah digunakan oleh anggota lain!' 
        : 'Gagal memperbarui data: ' . $e->getMessage();

    $_SESSION['flash'] = ['type' => 'error', 'pesan' => $pesan];
    header('Location: edit.php?id=' . urlencode($id));
    exit;
}