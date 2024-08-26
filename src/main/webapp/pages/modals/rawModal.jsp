 <script src="js/modal.js"></script>
<link rel="stylesheet" href="css/modal.css" type="text/css" />

  <button id="openModalButton" class="px-4 py-2 text-white bg-indigo-500 rounded m-5">
	<i class="fas fa-plus"></i>
  </button>

<dialog id="modal" class="relative p-6 bg-[#161624] rounded-lg shadow-lg max-w-3xl">
    <button id="closeModalButtonTop" class="close-button">
      <svg xmlns="http://www.w3.org/2000/svg" class="w-6 h-6 text-gray-700 hover:text-gray-900" fill="none"
        viewBox="0 0 24 24" stroke="currentColor">
        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M6 18L18 6M6 6l12 12" />
      </svg>
    </button>
    <label class="text-white-100 text-lg">Add Raw Matterial</label>
    <div class="grid gap-4 mb-4 sm:grid-cols-2 mt-5">
 
                    <div>
                        <label for="name" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Material Code</label>
                        <input type="text" name="name" id="name" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-[#f23634] focus:border-[#f23634] block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500" required="">
                    </div>
                    <div>
                        <label for="brand" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Material Name</label>
                        <input type="text" name="brand" id="brand" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-[#f23634] focus:border-[#f23634] block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500" required="">
                    </div>
                    <div>
                        <label for="name" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Unit of Measurement</label>
                        <input type="text" name="name" id="name" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-[#f23634] focus:border-[#f23634] block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500" required="">
                    </div>
                    </div>
                    <div class="grid gap-4 mb-4 sm:grid-cols-3 mt-5">
                    <div>
                        <label for="price" class="block mb-2 text-sm font-medium text-gray-300 dark:text-white">Date Received</label>
                        <input type="date" id="birthday" name="birthday">
                    </div>  
                    <div>
                        <label for="price" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">User ID</label>
                        <label for="price" class="block mb-2 text-sm font-medium text-gray-300 dark:text-white">#</label>
                    </div>  
                    <div>
                        <label for="price" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Branch ID</label>
                        <label for="price" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">#</label>
                    </div>
                </div>
    <div class="flex justify-end space-x-2">
      <button id="closeModalButtonBottom" class="px-4 py-2 text-white bg-indigo-500 rounded">
        Add
      </button>
    </div>
  </dialog>